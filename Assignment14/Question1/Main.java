class Main { 
    public static void main(String[] args) { 
        String s = "programming"; 
        int vowels = 0; 
 
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
 
            if (ch == 'a' || ch == 'e' || ch == 'i' 
                    || ch == 'o' || ch == 'u') { 
                vowels++; 
            } 
        } 
 
        System.out.println("Vowels: " + vowels); 
    } 
}
