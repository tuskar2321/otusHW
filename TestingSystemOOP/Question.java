package TSOOP;

class Question {
    private static int questionCounter;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correctAnswer;

    public Question(){
        questionCounter++;
    }

    public Question(String question, String answer1, String answer2, String answer3, String answer4, Integer correctAnswer) {
        this();
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "" + question + "\n" + answer1 + "\n" + answer2 + "\n" + answer3 + "\n" + answer4;
    }

    public static int getQuestionCounter() {
        return questionCounter;
    }

    protected Integer getCorrectAnswer() {
        return this.correctAnswer;
    }
}
