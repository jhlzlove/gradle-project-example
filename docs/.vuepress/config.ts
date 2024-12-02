import {defineUserConfig} from "vuepress";
import {defaultTheme} from "@vuepress/theme-default";
import viteBundler from "@vuepress/bundler-vite";

export default defineUserConfig({
    lang: "zh",
    title: "Gradle Project Example",
    description: "Gradle 管理的项目案例",

    locales: {
        "/": {
            lang: "zh",
        },
        "/en/": {
            lang: "en",
        }
    },

    base: "/gradle-project-example/",
    bundler: viteBundler(),
    theme: defaultTheme({

        locales: {
            "/": {
                selectLanguageText: "选择语言",
                selectLanguageName: "简体中文",
                prev: "上一篇",
                next: "下一篇",
                editLinkText: "编辑此页",
                lastUpdated: false,
            },
            "/en/": {
                selectLanguageName: "English",
            },
        },

        logo: "",
        repo: "jhlzlove/gradle-project-example",
        docsBranch: "main",
        docsDir: "docs",
        editLinkPattern: ":repo/-/edit/:branch/:path",

        navbar: [
            {
                text: "首页",
                link: "/"
            },
        ],

        sidebar: [
            {
                text: '概览',
                link: "/quickstart",
            },
            {
                text: "base-code",
                prefix: "/basecode/",
                children: [
                    "index",
                ],
            },
            {
                text: "jimmer-example",
                prefix: "/jimmer-example/",
                children: [
                    "jimmer",
                ],
            },
        ]
    }),
})