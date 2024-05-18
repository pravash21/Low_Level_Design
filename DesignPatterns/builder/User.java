package builder;

public class User {
    String name;
    int age;
    String email;
    String gender;
    String universityName;
    String degree;
    String phoneNumber;

    static Builder getBuilder() {
        return new Builder();
    }



     private User(Builder builder) {

        this.name = builder.getName();
        this.age = builder.getAge();

    }

    static class Builder {
        private String name;
        private int age;
        private String email;
        private String gender;
        private String universityName;
        private String degree;
        private String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public String getDegree() {
            return degree;
        }

        public void setDegree(String degree) {
            this.degree = degree;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        User build() {
            if(this.getAge() < 18) {
                throw new IllegalArgumentException("Age should be more than 18");
            }
            return new User(this);
        }

    }



}