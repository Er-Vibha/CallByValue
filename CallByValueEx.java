class CallByValueEx {
    int data = 10;
    void change(CallByValueEx op) {
        op.data = op.data + 100;
    }
    public static void main(String[] args) {
        CallByValueEx op = new CallByValueEx();
        System.out.println("Before Change: "+ op.data);
        op.change(op);
        System.out.println("After Change: "+ op.data);
    }
}