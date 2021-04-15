public class TV {

    private State homeState; 
    private State netflixState; 
    private State huluState; 
    private State state; 

    public TV() {

    }

    public void pressHomeButton() {

        state.pressHomeButton();
    }

    public void pressNetflixButton() {

        state.pressNetflixButton();
    }

    public void pressHuluButton() {

        state.pressHuluButton();
    }

    public void pressMovieButton() {

        state.pressMovieButton();
    }

    public void pressTVButton() {

        state.pressTVButton(); 
    }


    public State getHomeState() {
        return this.homeState;
    }

    public void setHomeState(State xHomeState) {
        this.homeState = xHomeState;
    }

    public State getNetflixState() {
        return this.netflixState;
    }

    public void setNetflixState(State xNetflixState) {
        this.netflixState = xNetflixState;
    }

    public State getHuluState() {
        return this.huluState;
    }

    public void setHuluState(State xHuluState) {
        this.huluState = xHuluState;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }
}