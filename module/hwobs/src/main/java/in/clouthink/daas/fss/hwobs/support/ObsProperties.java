package in.clouthink.daas.fss.hwobs.support;

import java.util.Map;

/**
 * Config for oss client.
 *
 * @author vanish
 */
public interface ObsProperties {

    /**
     * The oss access key id
     */
    String getKeyId();

    /**
     * The oss access secret
     */
    String getKeySecret();

    String getSecurityToken();

    /**
     * The oss domain base
     */
    String getEndpoint();

    /**
     * The default bucket to store the file which's bucket is not specified for category.
     */
    String getDefaultBucket();

    /**
     * The file's category and bucket mapping, the file will be stored in corresponding bucket for different category,
     * if the bucket is not defined for the file's category , the default bucket will be taken place.
     */
    Map<String, String> getBuckets();

}
