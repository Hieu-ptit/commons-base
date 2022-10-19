package com.viettel.api.converter;

import com.dslplatform.json.JsonReader;
import com.dslplatform.json.JsonWriter;
import com.viettel.api.model.TransactionMetadata;
import com.viettel.commons.util.Json;

import javax.persistence.AttributeConverter;
import java.nio.charset.StandardCharsets;

public class TransactionMetadataConverter implements AttributeConverter<TransactionMetadata, String> {
    private static final JsonReader.ReadObject<TransactionMetadata> metadataReader = Json.findReader(TransactionMetadata.class);
    private static final JsonWriter.WriteObject<TransactionMetadata> metadataWriter = Json.findWriter(TransactionMetadata.class);

    @Override
    public String convertToDatabaseColumn(TransactionMetadata metadata) {
        return metadata != null ? Json.encodeToString(metadata, metadataWriter) : null;
    }

    @Override
    public TransactionMetadata convertToEntityAttribute(String dbData) {
        return dbData != null ? Json.decode(dbData.getBytes(StandardCharsets.UTF_8), metadataReader) : null;
    }
}
