class CallByValueEx1{
    int value=30;
    void change(int value){
        value=value+10;
    }
    public static void main(String[] args) {
        CallByValueEx1 Call=new CallByValueEx1();
        System.out.println("Before Change: "+Call.value);
        Call.change(20);
        System.out.println("After Change: "+Call.value);
    }
}