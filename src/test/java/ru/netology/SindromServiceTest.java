package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SindromServiceTest {

    @Test
    void shouldfindMax() {
        SindromService service = new SindromService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }


    @Test
    void shouldFindMin() {
        SindromService service = new SindromService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 3;

        long actual = service.findMin(incomesInBillions);

        assertEquals(expected, actual);
    }
}



