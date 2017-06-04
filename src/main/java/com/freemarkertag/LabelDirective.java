package com.freemarkertag;

import freemarker.core.Configurable;
import freemarker.core.Environment;
import freemarker.template.*;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zmm on 17-6-2.
 */
public class LabelDirective implements TemplateDirectiveModel {
    public void execute(Environment environment, Map map, TemplateModel[] templateModels, TemplateDirectiveBody templateDirectiveBody) throws TemplateException, IOException {
        Writer out = environment.getOut();
        TemplateModel model = (TemplateModel) map.get("num");
        int num = ((TemplateNumberModel)model).getAsNumber().intValue();
        out.write("value=========>" + num);
        if (templateDirectiveBody != null) {
            templateDirectiveBody.render(out);
        }else {
            throw new RuntimeException("标签内不包含该属性");
        }

    }


    @Deprecated
    public static void main(String[] args) throws IOException, TemplateException {
        Configuration conf = new Configuration();
        conf.setSharedVariable("label", new LabelDirective());
        URL resource = Thread.currentThread().getClass().getResource("/temp");
        System.out.println(resource.getPath());
        String path = resource.getPath();
        conf.setDirectoryForTemplateLoading(new File(path));
        conf.setObjectWrapper(new DefaultObjectWrapper());

        Template template = conf.getTemplate("list.ftl");
        Map<String, String> map = new HashMap<String, String>();
        map.put("user", "test");
        File file = new File("/home/zmm/test/test.html");
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
        template.process(map, out);
    }
}
