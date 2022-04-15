package org.jabref.logic.importer.fetcher;

import org.jabref.testutils.category.FetcherTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@FetcherTest
public class DOABFetcherTest {
    private DOABFetcher fetcher;

    @BeforeEach
    public void setUp() {
        fetcher = new DOABFetcher();
    }

    @Test
    public void TestGetName() {
        assertEquals("DOAB", fetcher.getName());
    }
}
