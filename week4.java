class HelloWorld {
    public static String removeDuplicates(String s){
        String a = ""; a += s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            Boolean c = true;
            for(int j = 0; j < a.length(); j++){
                if(a.charAt(j) == s.charAt(i)) c = false;
            }
            if(c == true) a += s.charAt(i);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String s = "aabbcc";
        System.out.println(removeDuplicates(s));
    }
}


class HelloWorld {
    public enum UserRole {
        USER(1),
        MODERATOR(2),
        ADMIN(3);
        
        private int permissionLevel;
        UserRole(int permissionLevel) {
            this.permissionLevel = permissionLevel;
        }
        public int getPermissionLevel() {
            return permissionLevel;
        }
    }
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        UserRole role = UserRole.USER;
        System.out.println(role.getPermissionLevel()); // Output: 2
    }
}
