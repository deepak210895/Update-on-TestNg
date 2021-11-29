package com.testNG_Features;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transformer_cls implements IAnnotationTransformer {
	public void transformer(ITestAnnotation annotation,Class testclass) {
    annotation.setRetryAnalyzer(Retry_cls.class);
	}
	

}
