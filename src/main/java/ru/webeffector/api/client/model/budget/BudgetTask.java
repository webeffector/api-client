package ru.webeffector.api.client.model.budget;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ernest Sadykov
 * @since 25.08.2014
 */
public class BudgetTask {

    String domain;
    String region;
    List<Query> queries;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Query> getQueries() {
        return queries;
    }

    public void setQueries(List<Query> queries) {
        this.queries = queries;
    }

    public static class Builder {
        private BudgetTask task = new BudgetTask();

        public Builder domain(String domain) {
            task.setDomain(domain);
            return this;
        }

        public Builder region(String region) {
            task.setRegion(region);
            return this;
        }

        public Builder queries(List<Query> queries) {
            task.setQueries(queries);
            return this;
        }

        public Builder addQuery(Query query) {
            if (task.getQueries() == null) {
                task.setQueries(new ArrayList<Query>());
            }
            task.getQueries().add(query);

            return this;
        }

        public BudgetTask build() {
            if (StringUtils.isBlank(task.getDomain())) {
                throw new IllegalStateException("domain is empty");
            }
            if (StringUtils.isBlank(task.getRegion())) {
                throw new IllegalStateException("region is empty");
            }
            if (CollectionUtils.isEmpty(task.getQueries())) {
                throw new IllegalStateException("no queries");
            }
            return task;
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("queries", queries)
                .append("region", region)
                .append("domain", domain)
                .toString();
    }
}
