package flow;

import java.util.concurrent.Flow;

class TempProcessor implements Flow.Processor<TempInfo, TempInfo> {
    private Flow.Subscriber<TempInfo> subscriber;

    @Override
    public void subscribe(Flow.Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        subscriber.onSubscribe(subscription);
    }

    @Override
    public void onNext(TempInfo item) {
        subscriber.onNext(new TempInfo(item.getTown(), (item.getTemp() - 32) * 5/9));
    }

    @Override
    public void onError(Throwable throwable) {
        subscriber.onError(throwable);
    }

    @Override
    public void onComplete() {
        subscriber.onComplete();
    }
}
