package io.ayers.spring.basics.fundamentals;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class QuickSortAlgo implements SortAlgo {
    public int[] sort(int[] numbers) {
        return new int[] {3, 2, 1};
    }
}
