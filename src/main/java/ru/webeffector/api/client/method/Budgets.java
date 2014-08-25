package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.budget.BudgetTask;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.RequestBody;
import ru.webeffector.api.client.util.WebeffectorMethod;

/**
 * @author Ernest Sadykov
 * @since 25.08.2014
 */
public interface Budgets {

    @ApiMethod(WebeffectorMethod.AddBudgetTask)
    void addBudgetTask(@RequestBody BudgetTask task,
                       @ContextArgument("task_id") String taskId);

}
