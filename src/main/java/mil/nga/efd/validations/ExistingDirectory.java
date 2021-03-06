package mil.nga.efd.validations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Annotation interface for validating that an incoming String is a full path
 * to an existing directory.
 * 
 * @author L. Craig Carpenter
 */
@Constraint(validatedBy = ExistingDirectoryValidator.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExistingDirectory {
    
    String message() default "{pathNotExist}";
    
    Class<?>[] groups() default{};
    
    Class<? extends Payload>[] payload() default{};
}
