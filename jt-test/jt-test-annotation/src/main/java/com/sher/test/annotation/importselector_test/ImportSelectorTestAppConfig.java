package com.sher.test.annotation.importselector_test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author sherxia92
 */
@Configuration
@Import(ImportSelectorImp.class)
public class ImportSelectorTestAppConfig {
}
