package ru.webeffector.api.client.model.matrix;

/**
 * @author Sergey Zudin
 * @since 06.03.15.
 */
public class ParameterInfo {

    @Description("Имя параметра")
    private String parameterName;

    @Description("Результат выполнения параметра")
    private String result;

    @Description("Длительность выполнения")
    private long executionTime;

    @Description("Статус выполнения")
    private String status;

    @Description("Описание параметра")
    private String description;

    @Description("Результат выполнения параметра")
    private String errorMessage;

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
