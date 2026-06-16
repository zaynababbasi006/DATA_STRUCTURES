public class stackimplementation{
    int[] stack = new int[3];
    int top=-1;
    void push(int value){
        top =top+1;
        stack[top] = value;
        System.out.println(value);

    }
    void pop(){
        System.out.println("lifo:" + stack[top]);
        top=top-1;
    }
    public static void main(String[] args){
        stackimplementation s = new stackimplementation();
        s.push(5);
        s.push(8);
        s.push(10);
        s.pop();
        s.pop();
    }
}