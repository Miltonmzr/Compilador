/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package lexico;

/**
 *
 * @author Milton
 */
public enum Operators {
        IDENTIFIER(78), EQEQ(79), PLUS(80), EQ(81), SUBTRACTION(82), DIVISION(83), 
        MULTIPLICATION(84), OR(85), TERN_OR(86), QUEST(87), OPEN_BRACKET(88), CLOSE_BRACKET(89),
        OPEN_PARENTHESES(90), CLOSE_PARENTHESES(91), DOTE(92), SEMICOLON(93), WHITESPACE(97),
        COMMENT(98), COMMA(99), LESSER_THAN(100), UPPER_THAN(101), LESSER_OR_EQUAL(102), 
        UPPER_OR_EQUAL(103), SQUARE_OPEN_BRACKET(106), SQUARE_CLOSE_BRACKET(107), DOUBLE_QUOTATION_MARK(108),
        QUOTATION_MARK(109); 

        public int value;

        private Operators(int value) {
            this.value = value;
        }
    }
