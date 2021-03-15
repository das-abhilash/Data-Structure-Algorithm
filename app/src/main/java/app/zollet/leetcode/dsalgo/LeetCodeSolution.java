package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {


    public void execute() {
    }

    public class Codec {

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            return new StringBuilder(longUrl).reverse().toString();
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return new StringBuilder(shortUrl).reverse().toString();
        }
    }

}