package com.solarwinds;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
@Slf4j
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Mock
    Board board;


    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue(true);
    }
}
