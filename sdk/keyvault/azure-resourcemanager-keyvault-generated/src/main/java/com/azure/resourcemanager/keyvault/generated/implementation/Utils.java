// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.util.CoreUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import reactor.core.publisher.Mono;

final class Utils {
    static String getValueFromIdByName(String id, String name) {
        if (id == null) {
            return null;
        }
        Iterator<String> itr = Arrays.stream(id.split("/")).iterator();
        while (itr.hasNext()) {
            String part = itr.next();
            if (part != null && !part.trim().isEmpty()) {
                if (part.equalsIgnoreCase(name)) {
                    if (itr.hasNext()) {
                        return itr.next();
                    } else {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    static String getValueFromIdByParameterName(String id, String pathTemplate, String parameterName) {
        if (id == null || pathTemplate == null) {
            return null;
        }
        String parameterNameParentheses = "{" + parameterName + "}";
        List<String> idSegmentsReverted = Arrays.asList(id.split("/"));
        List<String> pathSegments = Arrays.asList(pathTemplate.split("/"));
        Collections.reverse(idSegmentsReverted);
        Iterator<String> idItrReverted = idSegmentsReverted.iterator();
        int pathIndex = pathSegments.size();
        while (idItrReverted.hasNext() && pathIndex > 0) {
            String idSegment = idItrReverted.next();
            String pathSegment = pathSegments.get(--pathIndex);
            if (!CoreUtils.isNullOrEmpty(idSegment) && !CoreUtils.isNullOrEmpty(pathSegment)) {
                if (pathSegment.equalsIgnoreCase(parameterNameParentheses)) {
                    if (pathIndex == 0 || (pathIndex == 1 && pathSegments.get(0).isEmpty())) {
                        List<String> segments = new ArrayList<>();
                        segments.add(idSegment);
                        idItrReverted.forEachRemaining(segments::add);
                        Collections.reverse(segments);
                        if (segments.size() > 0 && segments.get(0).isEmpty()) {
                            segments.remove(0);
                        }
                        return String.join("/", segments);
                    } else {
                        return idSegment;
                    }
                }
            }
        }
        return null;
    }

    static <T, S> PagedIterable<S> mapPage(PagedIterable<T> pageIterable, Function<T, S> mapper) {
        return new PagedIterableImpl<T, S>(pageIterable, mapper);
    }

    private static final class PagedIterableImpl<T, S> extends PagedIterable<S> {

        private final PagedIterable<T> pageIterable;
        private final Function<T, S> mapper;
        private final Function<PagedResponse<T>, PagedResponse<S>> pageMapper;

        private PagedIterableImpl(PagedIterable<T> pageIterable, Function<T, S> mapper) {
            super(new PagedFlux<S>(Mono::empty));
            this.pageIterable = pageIterable;
            this.mapper = mapper;
            this.pageMapper =
                page ->
                    new PagedResponseBase<Void, S>(
                        page.getRequest(),
                        page.getStatusCode(),
                        page.getHeaders(),
                        page.getElements().stream().map(mapper).collect(Collectors.toList()),
                        page.getContinuationToken(),
                        null);
        }

        @Override
        public Stream<S> stream() {
            return pageIterable.stream().map(mapper);
        }

        @Override
        public Stream<PagedResponse<S>> streamByPage() {
            return pageIterable.streamByPage().map(pageMapper);
        }

        @Override
        public Stream<PagedResponse<S>> streamByPage(String continuationToken) {
            return pageIterable.streamByPage(continuationToken).map(pageMapper);
        }

        @Override
        public Stream<PagedResponse<S>> streamByPage(int preferredPageSize) {
            return pageIterable.streamByPage(preferredPageSize).map(pageMapper);
        }

        @Override
        public Stream<PagedResponse<S>> streamByPage(String continuationToken, int preferredPageSize) {
            return pageIterable.streamByPage(continuationToken, preferredPageSize).map(pageMapper);
        }

        @Override
        public Iterator<S> iterator() {
            return new IteratorImpl<T, S>(pageIterable.iterator(), mapper);
        }

        @Override
        public Iterable<PagedResponse<S>> iterableByPage() {
            return new IterableImpl<PagedResponse<T>, PagedResponse<S>>(pageIterable.iterableByPage(), pageMapper);
        }

        @Override
        public Iterable<PagedResponse<S>> iterableByPage(String continuationToken) {
            return new IterableImpl<PagedResponse<T>, PagedResponse<S>>(
                pageIterable.iterableByPage(continuationToken), pageMapper);
        }

        @Override
        public Iterable<PagedResponse<S>> iterableByPage(int preferredPageSize) {
            return new IterableImpl<PagedResponse<T>, PagedResponse<S>>(
                pageIterable.iterableByPage(preferredPageSize), pageMapper);
        }

        @Override
        public Iterable<PagedResponse<S>> iterableByPage(String continuationToken, int preferredPageSize) {
            return new IterableImpl<PagedResponse<T>, PagedResponse<S>>(
                pageIterable.iterableByPage(continuationToken, preferredPageSize), pageMapper);
        }
    }

    private static final class IteratorImpl<T, S> implements Iterator<S> {

        private final Iterator<T> iterator;
        private final Function<T, S> mapper;

        private IteratorImpl(Iterator<T> iterator, Function<T, S> mapper) {
            this.iterator = iterator;
            this.mapper = mapper;
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public S next() {
            return mapper.apply(iterator.next());
        }

        @Override
        public void remove() {
            iterator.remove();
        }
    }

    private static final class IterableImpl<T, S> implements Iterable<S> {

        private final Iterable<T> iterable;
        private final Function<T, S> mapper;

        private IterableImpl(Iterable<T> iterable, Function<T, S> mapper) {
            this.iterable = iterable;
            this.mapper = mapper;
        }

        @Override
        public Iterator<S> iterator() {
            return new IteratorImpl<T, S>(iterable.iterator(), mapper);
        }
    }
}
