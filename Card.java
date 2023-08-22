public class Card {
    private
        int pin;
        int stripNumber;

    public
        Card(int pin, int stripNumber){
            this.pin = pin;
            this.stripNumber = stripNumber;
        }

        int getPIN(){ return pin; }
        int getStripNumber(){ return stripNumber; }

        void setPIN(int pin){ this.pin = pin; }
        void setStripNumber(int stripNumber){ this.stripNumber = stripNumber; }

}
