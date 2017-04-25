package model.events;

import java.util.List;

public class Event
{
    public static List<EventListener> listeners;

    public void updateListeners()
    {
        for(EventListener eventListener : listeners)
            eventListener.onEvent(this);
    }

    public boolean consumed;
}
