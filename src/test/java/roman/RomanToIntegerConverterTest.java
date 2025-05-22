package roman;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/*
  @author Sofia
  @project lab4
  @class ParallelogramTest
  @version 1.0.0
  @since 12.04.2025 - 15.43
*/
public class RomanToIntegerConverterTest {

    @Test void when_I_then_1()         { assertEquals(1, RomanToIntegerConverter.convertToInteger("I")); }
    @Test void when_II_then_2()        { assertEquals(2, RomanToIntegerConverter.convertToInteger("II")); }
    @Test void when_III_then_3()       { assertEquals(3, RomanToIntegerConverter.convertToInteger("III")); }
    @Test void when_IV_then_4()        { assertEquals(4, RomanToIntegerConverter.convertToInteger("IV")); }
    @Test void when_V_then_5()         { assertEquals(5, RomanToIntegerConverter.convertToInteger("V")); }
    @Test void when_VI_then_6()        { assertEquals(6, RomanToIntegerConverter.convertToInteger("VI")); }
    @Test void when_IX_then_9()        { assertEquals(9, RomanToIntegerConverter.convertToInteger("IX")); }
    @Test void when_X_then_10()        { assertEquals(10, RomanToIntegerConverter.convertToInteger("X")); }
    @Test void when_XII_then_12()      { assertEquals(12, RomanToIntegerConverter.convertToInteger("XII")); }
    @Test void when_XIV_then_14()      { assertEquals(14, RomanToIntegerConverter.convertToInteger("XIV")); }
    @Test void when_XV_then_15()       { assertEquals(15, RomanToIntegerConverter.convertToInteger("XV")); }
    @Test void when_XIX_then_19()      { assertEquals(19, RomanToIntegerConverter.convertToInteger("XIX")); }
    @Test void when_XX_then_20()       { assertEquals(20, RomanToIntegerConverter.convertToInteger("XX")); }
    @Test void when_XXVII_then_27()    { assertEquals(27, RomanToIntegerConverter.convertToInteger("XXVII")); }
    @Test void when_XL_then_40()       { assertEquals(40, RomanToIntegerConverter.convertToInteger("XL")); }
    @Test void when_XLIV_then_44()     { assertEquals(44, RomanToIntegerConverter.convertToInteger("XLIV")); }
    @Test void when_XLVIII_then_48()   { assertEquals(48, RomanToIntegerConverter.convertToInteger("XLVIII")); }
    @Test void when_XLIX_then_49()     { assertEquals(49, RomanToIntegerConverter.convertToInteger("XLIX")); }
    @Test void when_L_then_50()        { assertEquals(50, RomanToIntegerConverter.convertToInteger("L")); }
    @Test void when_LVIII_then_58()    { assertEquals(58, RomanToIntegerConverter.convertToInteger("LVIII")); }
    @Test void when_XC_then_90()       { assertEquals(90, RomanToIntegerConverter.convertToInteger("XC")); }
    @Test void when_XCVIII_then_98()   { assertEquals(98, RomanToIntegerConverter.convertToInteger("XCVIII")); }
    @Test void when_C_then_100()       { assertEquals(100, RomanToIntegerConverter.convertToInteger("C")); }
    @Test void when_CVIII_then_108()   { assertEquals(108, RomanToIntegerConverter.convertToInteger("CVIII")); }
    @Test void when_CD_then_400()      { assertEquals(400, RomanToIntegerConverter.convertToInteger("CD")); }
    @Test void when_D_then_500()       { assertEquals(500, RomanToIntegerConverter.convertToInteger("D")); }
    @Test void when_CM_then_900()      { assertEquals(900, RomanToIntegerConverter.convertToInteger("CM")); }
    @Test void when_M_then_1000()      { assertEquals(1000, RomanToIntegerConverter.convertToInteger("M")); }
    @Test void when_MCMXCIV_then_1994(){ assertEquals(1994, RomanToIntegerConverter.convertToInteger("MCMXCIV")); }
    @Test void when_MMXXIV_then_2024() { assertEquals(2024, RomanToIntegerConverter.convertToInteger("MMXXIV")); }
    @Test void when_MMM_then_3000()     { assertEquals(3000, RomanToIntegerConverter.convertToInteger("MMM")); }
}
