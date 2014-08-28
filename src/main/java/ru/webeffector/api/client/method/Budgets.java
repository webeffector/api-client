package ru.webeffector.api.client.method;

import ru.webeffector.api.client.model.budget.BudgetTask;
import ru.webeffector.api.client.model.budget.BudgetTaskResult;
import ru.webeffector.api.client.util.ApiMethod;
import ru.webeffector.api.client.util.ContextArgument;
import ru.webeffector.api.client.util.RequestBody;
import ru.webeffector.api.client.util.WebeffectorMethod;

import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 25.08.2014
 */
public interface Budgets {

    @ApiMethod(WebeffectorMethod.AddBudgetTask)
    void addBudgetTask(@RequestBody BudgetTask task,
                       @ContextArgument("task_id") String taskId);

    @ApiMethod(WebeffectorMethod.GetBudgetTask)
    BudgetTaskResult get(@ContextArgument("task_id") String taskId);

    @ApiMethod(WebeffectorMethod.ListBudgetTasks)
    List<BudgetTaskResult> list();

}
