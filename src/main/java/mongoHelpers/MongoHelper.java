package mongoHelpers;

import org.springframework.data.mongodb.core.mapping.BasicMongoPersistentEntity;
import org.springframework.data.mongodb.core.mapping.MongoPersistentEntity;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.util.ClassTypeInformation;
import org.springframework.data.util.TypeInformation;

public class MongoHelper {
    public static MongoEntityInformation getEntityInformationFor(Class clazz, Class idClazz) {
        TypeInformation typeInformation = ClassTypeInformation.from(clazz);
        MongoPersistentEntity mongoPersistentEntity = new BasicMongoPersistentEntity(typeInformation);
        return MongoEntityInformationSupport.entityInformationFor(mongoPersistentEntity, idClazz);
    }
}
