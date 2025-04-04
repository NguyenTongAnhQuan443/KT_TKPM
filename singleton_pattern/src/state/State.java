package state;

interface State {
    void handle(Context context);
}

class StateA implements State {
    public void handle(Context context) {
        System.out.println("Switching to StateB");
        context.setState(new StateB());
    }
}

class StateB implements State {
    public void handle(Context context) {
        System.out.println("Switching to StateA");
        context.setState(new StateA());
    }
}

class Context {
    private State state = new StateA();

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}