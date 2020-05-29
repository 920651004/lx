package build;

/**
 * Created by aser on 2020/5/26
 */
class APP {
    public static void main(String[] args){
        User user=User.buider()
                .name("张三")
                .age(11)
                .nickname("你猜猜")
                .password("123456")
                .build();
    }
}
