package fitnesse.wikitext.parser;

import fitnesse.html.HtmlUtil;

public class TextBuilder implements Translation {
    @Override
    public String toTarget(Translator translator, Symbol symbol) {
        return HtmlUtil.escapeHTML(HtmlUtil.unescapeWiki(symbol.getContent()));
    }
}
