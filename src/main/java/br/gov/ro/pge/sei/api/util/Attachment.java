package br.gov.ro.pge.sei.api.util;

import lombok.*;
import org.apache.commons.lang3.ObjectUtils;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Attachment {

    @Getter
    @Setter
    private String filename;

    @Setter
    private String contentId;

    @Getter
    @Setter
    private byte[] data;

    @Getter
    @Setter
    private boolean isMTOM;

    /**
     * @param filename
     * @param contentId
     * @param data
     */
    public Attachment(String filename, String contentId, byte[] data) {
        this.filename = filename;
        this.contentId = contentId;
        this.data = data;
    }

    /**
     * @return the contentId
     */
    public String getContentId() {
        if (ObjectUtils.isEmpty(this.contentId)) {
            this.contentId = UUID.randomUUID().toString();
        }
        return contentId;
    }

}
