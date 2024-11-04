package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if (s.contains(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String sdrawkcaB = "";
        for (int i = 0; i < array.length; i++) {
            sdrawkcaB = array[i].concat(" " +sdrawkcaB);
        }
        sdrawkcaB.trim();
        String[] answer = sdrawkcaB.split(" ");
        return answer;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String one = array[0];
        String two = array[array.length-1];
        if ( one == two ) {
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
//        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        String [] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//        String givenPhrase = array.toString().toLowerCase();
//        char [] givenArray = givenPhrase.toCharArray();
//        String iHateThis = givenArray.toString();
//        for (String letter : alpha) {
//            if(! iHateThis.contains(letter)) {return false;}
//        }
        String phrase = array.toString().toLowerCase();
        if (phrase.length()<26) {
            return false;
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (phrase.indexOf(ch) < 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String newPhrase= "";
        for (String word : array) {
            if (word != valueToRemove) {
                newPhrase = newPhrase.concat(" "+ word);
            }
        }
        newPhrase = newPhrase.trim();
        String[] answer = newPhrase.split(" ");
        return answer;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
            String secondList = array[0] +" ";

            for (String word : array) {
                if (!secondList.contains(word)) {
                    secondList = secondList.concat(word+" ");
                }
            }
            secondList = secondList.trim();
            String [] answer = secondList.split(" ");
            return answer;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
//        String bigAnswer = array[0] + " ";
//        for (String letter : array) {
//            if (bigAnswer.length() == letter)
//        }
//    }
return null;

}}
