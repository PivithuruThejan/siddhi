package org.wso2.siddhi.core.util.collection.expression;

import org.wso2.siddhi.query.api.expression.Expression;

/**
 * Created by suho on 6/25/16.
 */
public class AndCollectionExpression implements CollectionExpression {

    private final Expression expression;
    private final CollectionScope collectionScope;
    private CollectionExpression leftCollectionExpression;
    private CollectionExpression rightCollectionExpression;

    public AndCollectionExpression(Expression expression, CollectionScope collectionScope, CollectionExpression leftCollectionExpression, CollectionExpression rightCollectionExpression) {
        this.expression = expression;
        this.collectionScope = collectionScope;
        this.leftCollectionExpression = leftCollectionExpression;
        this.rightCollectionExpression = rightCollectionExpression;
    }

    public CollectionExpression getLeftCollectionExpression() {
        return leftCollectionExpression;
    }

    public CollectionExpression getRightCollectionExpression() {
        return rightCollectionExpression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public CollectionScope getCollectionScope() {
        return collectionScope;
    }
}