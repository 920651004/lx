package build;

/**
 * Created by Admin on 2020/1/15
 * 建造者模式 通常最明显的就是有一个builder
 */
class User {
    private String name;
    private String password;
    private String nickname;
    private int age;

    public User(String name, String password, String nickname, int age) {
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
    }
    public static UserBuilder buider(){
        return new UserBuilder();
    }
    public static class UserBuilder{
        private String name;
        private String password;
        private String nickname;
        private int age;

        public UserBuilder() {
        }
        public UserBuilder name(String name){
            this.name=name;
            return this;
        }
        public UserBuilder password(String password){
            this.password=password;
            return this;
        }
        public UserBuilder nickname(String nickname){
            this.nickname=nickname;
            return this;
        }
        public UserBuilder age(int age){
            this.age=age;
            return this;
        }
        public User build(){
            if (name==null||password==null){
                throw new RuntimeException("用户和密码必填");
            }
            if (age>150||age<0){
                throw new RuntimeException("年龄不合法");
            }
            return new User(name,password,nickname,age);
        }
    }

}
