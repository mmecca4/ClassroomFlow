/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classroomflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *
 * @author mich
 */
public class SystemInfoTest {
    @Test
    void testJavaVersion() {
        assertNotNull(SystemInfo.javaVersion());
    }
}
