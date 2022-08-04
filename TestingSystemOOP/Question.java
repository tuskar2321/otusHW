package TSOOP;

class Question {
    private static int questionCounter;
    private String question;
    private String[] answer;
    private int correctAnswer;

    public Question(){
        questionCounter++;
    }

    public Question(String question, Integer correctAnswer, String ... answer) {
        this();
        this.question = question;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return question + "\n" + printArrAnswer();
    }

    public String printArrAnswer(){
        StringBuilder answers = new StringBuilder();
        for (String i:answer){
            answers.append(i + "\n");
        }
        answers.delete((answers.length()-2), answers.length());
        return (answers.toString());
    }

    public static int getQuestionCounter() {
        return questionCounter;
    }

    protected Integer getCorrectAnswer() {
        return this.correctAnswer;
    }
}
