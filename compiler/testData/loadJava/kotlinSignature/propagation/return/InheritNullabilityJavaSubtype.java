package test;

import org.jetbrains.annotations.NotNull;
import java.lang.CharSequence;

import jet.runtime.typeinfo.KotlinSignature;

public interface InheritNullabilityJavaSubtype {

    public interface Super {
        @NotNull
        CharSequence foo();
    }

    public interface Sub extends Super {
        String foo();
    }
}