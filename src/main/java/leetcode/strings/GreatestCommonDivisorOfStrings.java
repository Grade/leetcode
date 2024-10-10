package leetcode.strings;

class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        String smallerString, largerString;
        if (str1.length() < str2.length()) {
            smallerString = str1;
            largerString = str2;
        } else {
            smallerString = str2;
            largerString = str1;
        }
        for (int divisorOccurrences = 1; divisorOccurrences <= smallerString.length(); divisorOccurrences++) {
            //smaller string must divide to len of a divisor evenly
            if (smallerString.length() % divisorOccurrences != 0) {
                continue;
            }
            int divisorLen = smallerString.length() / divisorOccurrences;
            //larger string must also divide to len of a divisor evenly. Formula is different, because number of occurrences in both strings may be different
            if (largerString.length() % divisorLen != 0) {
                continue;
            }
            if (isCandidate(smallerString, smallerString, divisorLen) && isCandidate(largerString, smallerString, divisorLen)) {
                return smallerString.substring(0, divisorLen);
            }
        }
        return "";
    }

    private boolean isCandidate(String originalString, String divisorString, int divisorLen) {
        int divisorOccurrences = originalString.length() / divisorLen;
        for (int k = 0; k < divisorLen; k++) {
            char c = divisorString.charAt(k);
            for (int j = 0; j < divisorOccurrences; j++) {
                if (c != originalString.charAt(k + j * divisorLen)) {
                    return false;
                }
            }
        }
        return true;
    }
}
