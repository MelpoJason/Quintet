/*
 * For personal use;
 */

package com.quintet.testUtils.CacheUtils;

import org.junit.Test;

public class CacheUtilsTest {

    private String fakeJson = "{\n" +
            "    \"ret\":true,\n" +
            "    \"data\":{\n" +
            "        \"id\":1516,\n" +
            "        \"name\":\"Mat\",\n" +
            "        \"code\":\"R0000983\",\n" +
            "        \"coverResUrl\":\"https://teacher-media.vipkid.com.cn/resource/f77e8b817c2a48d8870c6a285912d2c9.jpg\",\n" +
            "        \"description\":\"Sam and Mat sit outside. (Featuring the short a sound.)\",\n" +
            "        \"type\":4,\n" +
            "        \"status\":1,\n" +
            "        \"lexile\":{\n" +
            "            \"name\":\"BR-1L\",\n" +
            "            \"value\":-1,\n" +
            "            \"type\":\"BR\",\n" +
            "            \"showName\":\"BR\"\n" +
            "        },\n" +
            "        \"pageCount\":14,\n" +
            "        \"updateTime\":1527575422000,\n" +
            "        \"clickRate\":0,\n" +
            "        \"stockTotal\":null,\n" +
            "        \"stockAvailable\":null,\n" +
            "        \"allowRepeat\":1,\n" +
            "        \"companyId\":1,\n" +
            "        \"tag\":[\n" +
            "            {\n" +
            "                \"id\":43,\n" +
            "                \"name\":\"Phonic Readers\",\n" +
            "                \"fullName\":\"BOB_Phonic Readers\",\n" +
            "                \"serialNumber\":\"8-1\",\n" +
            "                \"isLeaf\":1,\n" +
            "                \"chName\":\"自然拼读故事\",\n" +
            "                \"rootId\":42\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\":38,\n" +
            "                \"name\":\"MC-L1\",\n" +
            "                \"fullName\":\"L_BOBLevel_MC-L1\",\n" +
            "                \"serialNumber\":\"7-1\",\n" +
            "                \"isLeaf\":1,\n" +
            "                \"chName\":\"\",\n" +
            "                \"rootId\":37\n" +
            "            }\n" +
            "        ],\n" +
            "        \"pages\":[\n" +
            "            {\n" +
            "                \"sequence\":1,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/84a1217eefde4ff5bb9dc968dd089b0b.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"\",\n" +
            "                \"contentForChivox\":\"\",\n" +
            "                \"canRecord\":false,\n" +
            "                \"recordSequence\":null\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":2,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/4d0592aff6af44d6aa7633fc3b5b52ce.mp3\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/1b98312b0ec24ce0a37c16b3bece5e2c.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"Mat\",\n" +
            "                \"contentForChivox\":\"{\"text\":\"Mat\",\"prons\":[]}\",\n" +
            "                \"canRecord\":true,\n" +
            "                \"recordSequence\":1\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":3,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/b2ad4a6eb3184e2bbb99e5b0df9f0ae7.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"\",\n" +
            "                \"contentForChivox\":\"\",\n" +
            "                \"canRecord\":false,\n" +
            "                \"recordSequence\":null\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":4,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/b0035a1f16ea4d4f809df6fc8c5a8480.mp3\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/cf0d725fa0b74cec8e7332e22da76230.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"Mat.\",\n" +
            "                \"contentForChivox\":\"{\"text\":\"Mat.\",\"prons\":[]}\",\n" +
            "                \"canRecord\":true,\n" +
            "                \"recordSequence\":2\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":5,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/354d2650c9204588b0b02ef5224fb2d6.mp3\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/fba5acfea6d64b3ba7ae1492645101ea.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"Mat sat.\",\n" +
            "                \"contentForChivox\":\"{\"text\":\"Mat sat.\",\"prons\":[]}\",\n" +
            "                \"canRecord\":true,\n" +
            "                \"recordSequence\":3\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":6,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/652d2ffefb9d4eb5aec77a87602c7d50.mp3\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/454b7038bf0248dfaebf5cada3d70a6c.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"Sam.\",\n" +
            "                \"contentForChivox\":\"{\"text\":\"Sam.\",\"prons\":[]}\",\n" +
            "                \"canRecord\":true,\n" +
            "                \"recordSequence\":4\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":7,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/a85f5b53d7ca452ba690d7ec4286df70.mp3\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/607e1f1598144bd58fe0e59d3efdf282.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"Sam sat.\",\n" +
            "                \"contentForChivox\":\"{\"text\":\"Sam sat.\",\"prons\":[]}\",\n" +
            "                \"canRecord\":true,\n" +
            "                \"recordSequence\":5\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":8,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/2cf1b99bbfea40239656554c53f48300.mp3\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/59d96cfdf1c84e2ba12d18326043484f.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"Mat sat.Sam sat.\",\n" +
            "                \"contentForChivox\":\"{\"text\":\"Mat sat.Sam sat.\",\"prons\":[]}\",\n" +
            "                \"canRecord\":true,\n" +
            "                \"recordSequence\":6\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":9,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/b65da0595cd64a29930eef9d54468897.mp3\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/d26e2d7be8924eaba8cbaab9d6231418.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"Mat sat on Sam.\",\n" +
            "                \"contentForChivox\":\"{\"text\":\"Mat sat on Sam.\",\"prons\":[]}\",\n" +
            "                \"canRecord\":true,\n" +
            "                \"recordSequence\":7\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":10,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/87d978d5708147bf8729e2e76c8be835.mp3\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/d7a92c694bfd4369b2e63973cb85a18b.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"Sam sat on Mat.\",\n" +
            "                \"contentForChivox\":\"{\"text\":\"Sam sat on Mat.\",\"prons\":[]}\",\n" +
            "                \"canRecord\":true,\n" +
            "                \"recordSequence\":8\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":11,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/16f8c3a330e34e17817388cf65b2839d.mp3\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/dd6ec9c0b3a248adba81f35ece84905d.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"Mat sat. Sam sat.\",\n" +
            "                \"contentForChivox\":\"{\"text\":\"Mat sat. Sam sat.\",\"prons\":[]}\",\n" +
            "                \"canRecord\":true,\n" +
            "                \"recordSequence\":9\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":12,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/5ab8beed8fb54a9eb1924f2b4ad1fdda.mp3\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/1da472751c2845a9a5251403421f8fb7.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"The End.\",\n" +
            "                \"contentForChivox\":\"{\"text\":\"The End.\",\"prons\":[]}\",\n" +
            "                \"canRecord\":true,\n" +
            "                \"recordSequence\":10\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":13,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/403fb067ffe84ed4b9a6a00e950d6437.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"\",\n" +
            "                \"contentForChivox\":\"\",\n" +
            "                \"canRecord\":false,\n" +
            "                \"recordSequence\":null\n" +
            "            },\n" +
            "            {\n" +
            "                \"sequence\":14,\n" +
            "                \"subtitle\":\"\",\n" +
            "                \"type\":null,\n" +
            "                \"audios\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"images\":[\n" +
            "                    {\n" +
            "                        \"url\":\"https://teacher-media.vipkid.com.cn/resource/e99095d63ae9488ab9320bf8cdca658e.jpg\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"videos\":[\n" +
            "\n" +
            "                ],\n" +
            "                \"content\":\"\",\n" +
            "                \"contentForChivox\":\"\",\n" +
            "                \"canRecord\":false,\n" +
            "                \"recordSequence\":null\n" +
            "            }\n" +
            "        ],\n" +
            "        \"curriculumNode\":null,\n" +
            "        \"curriculumSN\":null,\n" +
            "        \"curriculumVersion\":null\n" +
            "    },\n" +
            "    \"errCode\":0,\n" +
            "    \"errMsg\":null\n" +
            "}\n" +
            "\n";

    @Test
    public void createCache() {
//        JSONObject jsonObject = JSONObject.parseObject(fakeJson);
        String fakeString = "fake String";
        CacheUtils.initCache(fakeJson);

    }
}