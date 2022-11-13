package newcompiler;

public class MyPreprocessor implements Preprocessor{
    private String fileName;

    StringBuilder stringBuilder = new StringBuilder();


    @Override
    public SourceCode preprocess(SourceCode sourceCode) {

        System.out.println("Preprocessing code: "+sourceCode.getFileName());
        fileName = sourceCode.getFileName();
        stringBuilder.append("preprocessed_");
        stringBuilder.append(fileName);
        sourceCode.setFileName(stringBuilder.toString());
        System.out.println("Generating a new code: "+ sourceCode.getFileName());
        stringBuilder.setLength(0);
        return sourceCode;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

}
