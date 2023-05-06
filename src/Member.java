public class Member {

    private String name;            //필수
    private String id;              //필수
    private String pw;              //필수
    private int phoneNumber;        //필수
    private String gender;          //선택
    private String address;         //선택
    private String email;           //선택

    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.id;
    }
    public String getPw() {
        return this.pw;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getGender() {
        return this.gender;
    }
    public String getAddress() {
        return this.address;
    }
    public String getEmail() {
        return this.email;
    }


    //static nested class - Builder Pattern
    public static class MemberBuilder {
        private String name;            //필수
        private String id;              //필수
        private String pw;              //필수
        private int phoneNumber;        //필수
        private String gender;          //선택
        private String address;         //선택
        private String email;           //선택


        public MemberBuilder() {}

        public MemberBuilder(String name, String id, String pw, int phoneNumber) {
            this.name = name;
            this.id = id;
            this.pw = pw;
            this.phoneNumber = phoneNumber;
        }


        public MemberBuilder name(String name) {
            this.name = name;
            return this;        //method chaining
        }

        public MemberBuilder id(String id) {
            this.id = id;
            return this;
        }

        public MemberBuilder pw(String pw) {
            this.pw = pw;
            return this;
        }

        public MemberBuilder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public MemberBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public MemberBuilder address(String address) {
            this.address = address;
            return this;
        }

        public MemberBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Member build() {
            Member member = new Member();
            member.name = this.name;
            member.id = this.id;
            member.pw = this.pw;
            member.phoneNumber = this.phoneNumber;
            member.gender = this.gender;
            member.address = this.address;
            member.email = this.email;

            return member;
        }
    }
}
