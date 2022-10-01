package flow;

import java.util.concurrent.Flow;

class Main {
    public static void main(String[] args) {
        simpleTempPublisher("서울").subscribe(new TempSubscriber());
    }
    @SuppressWarnings("unchecked")
    static Flow.Publisher<TempInfo> simpleTempPublisher(String town){
        return subscriber -> {
            subscriber.onSubscribe(new TempSubscription((Flow.Subscriber<TempInfo>) subscriber, town));
        };
    }
}
