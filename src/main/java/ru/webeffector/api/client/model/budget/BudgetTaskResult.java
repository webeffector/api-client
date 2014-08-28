package ru.webeffector.api.client.model.budget;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 28.08.2014
 */
public class BudgetTaskResult extends BudgetTask {

    private String id;
    private BudgetTaskStatus status;
    private List<QueryResult> result;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BudgetTaskStatus getStatus() {
        return status;
    }

    public void setStatus(BudgetTaskStatus status) {
        this.status = status;
    }

    public List<QueryResult> getResult() {
        return result;
    }

    public void setResult(List<QueryResult> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("queries number", queries != null ? queries.size() : null)
                .append("region", region)
                .append("domain", domain)
                .append("id", id)
                .append("status", status)
                .append("result", result)
                .toString();
    }
}
