package javaclasses.inner;

public class DumbOwner {
    private int id;
    private static int coeff;
    public class DumberInner {
        private int id;
        public void setId(int id) {
            this.id = id + DumbOwner.this.id + DumbOwner.coeff; //или просто coeff
        }
    }
}
