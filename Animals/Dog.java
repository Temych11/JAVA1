package Animals;

public class Dog extends Animal implements Jumpable {
    private final int RUN_LIMIT = 100;
    private final float JUMP_LIMIT = 10f;
    private float jump_limit;

    public Dog(String name) {
        this.name = name;
        this.run_limit = RUN_LIMIT;
        jump_limit = JUMP_LIMIT;
    }
    public Dog(String name, int run_limit, float jump_limit) {
        this.name = name;
        this.run_limit = run_limit;
        this.jump_limit = jump_limit;
    }


    public String voice() {
        return "woof-woof";
    }

    public boolean jump(float height) {
        return jump_limit >= height;
    }

    public float getJumpLimit(){
        return jump_limit;
    }
}
