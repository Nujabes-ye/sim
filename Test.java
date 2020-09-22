public class Test {
    public static void change(String word) {   //定义转换方法

        byte[] bytes = word.getBytes();        //将形参word转换为byte型，并存储到bytes数组内

        StringBuffer buffer = new StringBuffer(); //StringBuffer类构造一个buffer对象

        char[] chars = new char[bytes.length];    //初始化数组chars[]

        char[] chars1 = new char[bytes.length];   //初始化数组chars1[]

        for (int i = 0; i < bytes.length; i++) {

            chars[i] = (char) bytes[i];           //将数组bytes[]中的byte型转换为char型并存放到chars[]中

            chars1[i] = Character.toUpperCase(chars[i]);  //将chars[]中的小写字母转化为大写字母后存放到chars1[]数组中

            buffer.append(chars1[i]);              //向对象buffer中添加字母

        }

        System.out.println(buffer);               //输出buffer
    }

    public static void main(String[] args) {

        String s = new String("jdk");   //创建对象s

        change(s);                             //调用change方法
    }

}



