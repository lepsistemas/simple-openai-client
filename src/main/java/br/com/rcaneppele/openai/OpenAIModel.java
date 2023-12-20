package br.com.rcaneppele.openai;

public enum OpenAIModel {

    GPT_3_5_TURBO_1106("gpt-3.5-turbo-1106"),
    GPT_3_5_TURBO("gpt-3.5-turbo"),
    GPT_3_5_TURBO_16k("gpt-3.5-turbo-16k"),
    GPT_3_5_TURBO_INSTRUCT("gpt-3.5-turbo-instruct"),
    GPT_4_1106_PREVIEW("gpt-4-1106-preview"),
    GPT_4("gpt-4"),
    GPT_4_32K("gpt-4-32k"),
    GPT_4_0613("gpt-4-0613"),
    GPT_4_32k_0613("gpt-4-32k-0613");

    private final String name;

    OpenAIModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
