/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */

import parser.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Data {
    /** Types of data */
    public enum Type {VOID, BOOLEAN, INTEGER, STRING;}

    /** Type of data*/
    private Type type;

    /** Value of the data */
    private int value;
    private String string;

    private ArrayList<Integer> array = null;

    Data(ArrayList<Integer> array, Type arrayType) {
        type = arrayType;
        this.array = array;
    }

    /** Constructor for integers */
    Data(int v) { type = Type.INTEGER; value = v; }

    /** Constructor for Booleans */
    Data(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; }

    Data(String s) {
        type = Type.STRING;
        string = s;
    }

    /** Constructor for void data */
    Data() {type = Type.VOID; }

    /** Copy constructor */
    Data(Data d) {
        type = d.type;
        if (type == Type.STRING) {
            string = d.string;
        }
        else value = d.value;
    }

    /** Returns the type of data */
    public Type getType() { return type; }

    /** Indicates whether the data is Boolean */
    public boolean isBoolean() { return type == Type.BOOLEAN && array == null; }

    /** Indicates whether the data is integer */
    public boolean isInteger() { return type == Type.INTEGER && array == null; }

    public boolean isString() {
        return type == Type.STRING && array == null;
    }

    /** Indicates whether the data is void */
    public boolean isVoid() { return type == Type.VOID; }

    public boolean isArray() {return array != null;}

    /**
     * Gets the value of an integer data. The method asserts that
     * the data is an integer.
     */
    public int getIntegerValue() {
        assert type == Type.INTEGER && array == null;
        return value;
    }

    public String getStringValue() {
        assert type == Type.STRING;
        return string;
    }

    public ArrayList<Integer> getArrayValue() {
        assert array != null;
        return array;
    }

    /**
     * Gets the value of a Boolean data. The method asserts that
     * the data is a Boolean.
     */
    public boolean getBooleanValue() {
        assert type == Type.BOOLEAN && array == null;
        return value == 1;
    }

    public int getValue() {return value;}

    /** Defines a Boolean value for the data */
    public void setValue(boolean b) { type = Type.BOOLEAN; value = b ? 1 : 0; }

    /** Defines an integer value for the data */
    public void setValue(int v) { type = Type.INTEGER; value = v; }

    /** Copies the value from another data */
    public void setData(Data d) {
        array = null;
        type = d.type;
        if (type == Type.STRING) {
            string = d.string;
        }
        else value = d.value;
    }

    public void setArray(ArrayList<Integer> array, Type type) {
        this.type = type;
        this.array = array;
    }
    
    /** Returns a string representing the data in textual form. */
    public String toString() {
        if (array != null) return "array";
        if (type == Type.BOOLEAN) return value == 1 ? "true" : "false";
        if (type == Type.STRING) return string;
        return Integer.toString(value);
    }
    
    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private void checkDivZero(Data d) {
        if (d.value == 0) throw new RuntimeException ("Division by zero");
    }

    /**
     * Evaluation of arithmetic expressions. The evaluation is done
     * "in place", returning the result on the same data.
     * @param op Type of operator (token).
     * @param d Second operand.
     */
    public void evaluateOperator(int op, Data d) {
        assert type == d.type;
        switch (type) {
            case INTEGER:
                switch (op) {
                    case AslLexer.PLUS: value += d.value; break;
                    case AslLexer.MINUS: value -= d.value; break;
                    case AslLexer.MUL: value *= d.value; break;
                    case AslLexer.DIV: checkDivZero(d); value /= d.value; break;
                    case AslLexer.MOD: checkDivZero(d); value %= d.value; break;
                    default: assert false;
                }
                break;
            case STRING:
                switch (op) {
                    case AslLexer.PLUS:
                        string += d.string;
                        break;
                    default: assert false;
                }
                break;
            default:assert false;
        }
    }

    /**
     * Evaluation of expressions with relational operators.
     * @param op Type of operator (token).
     * @param d Second operand.
     * @return A Boolean data with the value of the expression.
     */
    public Data evaluateRelational (int op, Data d) {
        assert type != Type.VOID && type != Type.STRING && array == null  && type == d.type;
        switch (op) {
            case AslLexer.EQUAL: return new Data(value == d.value);
            case AslLexer.NOT_EQUAL: return new Data(value != d.value);
            case AslLexer.LT: return new Data(value < d.value);
            case AslLexer.LE: return new Data(value <= d.value);
            case AslLexer.GT: return new Data(value > d.value);
            case AslLexer.GE: return new Data(value >= d.value);
            default: assert false; 
        }
        return null;
    }
}
