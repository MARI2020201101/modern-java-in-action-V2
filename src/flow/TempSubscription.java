package flow;

import java.util.concurrent.Flow;

public class TempSubscription implements Flow.Subscription {
    private Flow.Subscriber<TempInfo> subscriber;
    private String town;

    public TempSubscription(Flow.Subscriber<TempInfo> subscriber, String town) {
        this.subscriber = subscriber;
        this.town = town;
    }

    @Override
    public void request(long n) {
        try{
            for(long i = n ; i>=0; i--){
                subscriber.onNext(TempInfo.fetch(town));
            }
        }catch (Exception e){
            subscriber.onError(e.getCause());
        }
    }

    @Override
    public void cancel() {
        subscriber.onComplete();
    }
}
