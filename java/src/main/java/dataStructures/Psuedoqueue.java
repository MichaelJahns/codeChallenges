package dataStructures;

public class Psuedoqueue {
    Stack encode;
    Stack decode;

    public Psuedoqueue() {
        this.encode = new Stack();
        this.decode = new Stack();
    }

    private void reverse(Stack transferStack) {
        Stack targetStack = null;
        if (transferStack == encode) {
            targetStack = decode;
        } else if (transferStack == decode) {
            targetStack = encode;
        }
        int cycles = transferStack.getSize();
        for (int i = 0; i < cycles; i++) {
            targetStack.push(transferStack.head.value);
            transferStack.pop();
        }
    }

    public void psuedoEnqueue(int value) {
        if (decode.head != null) {
            reverse(decode);
        }
        encode.push(value);
    }

    public Node psudeoDequeue() {
        if (encode.head != null) {
            reverse(encode);
        }
        Node output = decode.pop();
        return output;
    }

    public Object[] print() {
        int[] outputEncode = new int[encode.getSize()];
        int[] outputDecode = new int[decode.getSize()];

        Node currentEncode = encode.head;
        for (int i = 0; i < encode.getSize(); i++) {
            outputEncode[i] = currentEncode.getValue();
            currentEncode = currentEncode.next();
        }
        Node currentDecode = decode.head;
        for (int i = 0; i < decode.getSize(); i++) {
            outputDecode[i] = currentDecode.getValue();
            currentDecode = currentDecode.next();
        }
        return new Object[]{outputDecode, outputEncode};
    }

    public Stack getEncode() {
        return this.encode;
    }

    public Stack getDecode() {
        return this.decode;
    }
}
